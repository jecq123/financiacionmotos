import { Component, OnInit } from '@angular/core';
import { Moto } from 'src/app/model/moto';
import { MotoService } from 'src/app/service/moto/moto.service';
import { Excepcion } from 'src/app/util/excepcion';

@Component({
  selector: 'app-cotizacion',
  templateUrl: './cotizacion.component.html',
  styleUrls: ['./cotizacion.component.css']
})
export class CotizacionComponent implements OnInit {
  motos: Moto[] = [];
  moto!: Moto;

  constructor(private motoService: MotoService) { }

  ngOnInit(): void {
    this.motoService.getAll().toPromise().then(motos => {
      this.motos = motos;
      console.log(motos);
    })
      .catch(error => Excepcion.controlar(error));
  }

}
