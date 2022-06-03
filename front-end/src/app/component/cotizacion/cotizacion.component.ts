import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from 'src/app/model/cliente';
import { Credito } from 'src/app/model/credito';
import { Moto } from 'src/app/model/moto';
import { Vendedor } from 'src/app/model/vendedor';
import { ClienteService } from 'src/app/service/cliente/cliente.service';
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
  moto: Moto | undefined;
  form!: FormGroup;
  cliente: Cliente | undefined;
  vendedor: Vendedor | undefined;

  constructor(
    private formBuilder: FormBuilder,
    private motoService: MotoService,
    private clienteService: ClienteService,
    private vendedorService: VendedorService
  ) { }

  ngOnInit(): void {
    this.buildForm();
    this.motoService.getAll().toPromise().then(motos => {
      this.motos = motos;
    }).catch(error => Excepcion.controlar(error));
    this.form.controls.idMoto.valueChanges.subscribe(idMoto => this.moto = this.motos.find(moto => moto.idMoto == idMoto));
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
    const valorCuota = ((this.moto ? this.moto.precio : 0) - Number(this.form.value.valorCuotaInicial))
      / Number(this.form.value.numeroCuotas) * 1.1;
    this.form.get('valorCuota')?.setValue(valorCuota);
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
    const credito: Credito = {
      ...this.form.value,
      moto: this.moto,
      cliente: this.cliente,
      vendedor: this.vendedor
    };
    console.log(credito);
    console.log(this.moto);
  }

}
