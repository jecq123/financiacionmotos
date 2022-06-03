import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from 'src/app/model/cliente';
import { Credito } from 'src/app/model/credito';
import { Moto } from 'src/app/model/moto';
import { Vendedor } from 'src/app/model/vendedor';
import { ClienteService } from 'src/app/service/cliente/cliente.service';
import { CreditoService } from 'src/app/service/credito/credito.service';
import { MotoService } from 'src/app/service/moto/moto.service';
import { VendedorService } from 'src/app/service/vendedor/vendedor.service';
import { Excepcion } from 'src/app/util/excepcion';

@Component({
  selector: 'app-cotizacion',
  templateUrl: './cotizacion.component.html',
  styleUrls: ['./cotizacion.component.css']
})
export class CotizacionComponent implements OnInit {
  motos: Moto[] = [];
  moto!: Moto;
  form!: FormGroup;
  cliente!: Cliente;
  vendedor!: Vendedor;
  credito!: Credito;

  constructor(
    private formBuilder: FormBuilder,
    private motoService: MotoService,
    private clienteService: ClienteService,
    private vendedorService: VendedorService,
    private creditoService: CreditoService
  ) { }

  ngOnInit(): void {
    this.buildForm();
    this.motoService.getAll().toPromise().then(motos => {
      this.motos = motos;
    }).catch(error => Excepcion.controlar(error));
    this.form.controls.idMoto.valueChanges.subscribe(idMoto => {
      const moto = this.motos.find(moto => moto.idMoto == idMoto);
      moto ? this.moto = moto : undefined;
    });
  }

  buildForm(): void {
    this.form = this.formBuilder.group({
      idCredito: [undefined],
      identificacionCliente: [undefined, Validators.required],
      identificacionVendedor: [undefined, Validators.required],
      idMoto: [undefined, Validators.required],
      valorCuotaInicial: [undefined, Validators.required],
      numeroCuotas: [undefined, Validators.required],
      valorCuota: [undefined, Validators.required]
    });
  }

  calcularValorCuota(): void {
    this.creditoService.calcularValorCuota(this.buildCredito()).toPromise()
      .then(valorCuota => this.form.get('valorCuota')?.setValue(valorCuota))
      .catch(error => Excepcion.controlar(error));
  }

  buscarCliente(): void {
    this.clienteService.obtenerPorIdentificacion(this.form.value.identificacionCliente).toPromise()
      .then(cliente => this.cliente = cliente).catch(error => Excepcion.controlar(error));
  }

  buscarVendedor(): void {
    this.vendedorService.obtenerPorIdentificacion(this.form.value.identificacionVendedor).toPromise()
      .then(vendedor => this.vendedor = vendedor).catch(error => Excepcion.controlar(error));
  }

  aceptarCredito(): void {
    this.credito = this.buildCredito();
    this.creditoService.crear(this.credito).toPromise().then(idCredito => this.credito.idCredito = idCredito.valor)
      .catch(error => Excepcion.controlar(error));
    console.log(this.credito);
    
  }

  buildCredito(): Credito {
    return {
      idCredito: this.form.value.idCredito,
      numeroCuotas: this.form.value.numeroCuotas,
      valorCuotaInicial: this.form.value.valorCuotaInicial,
      fecha: new Date(),
      valorCuota: this.form.value.valorCuota,
      moto: this.moto,
      valorMoto: this.moto.precio,
      cliente: this.cliente,
      vendedor: this.vendedor
    };
  }

}
