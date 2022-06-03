import { Component, OnInit } from '@angular/core';
import { Moto } from 'src/app/model/moto';
import { MotoService } from 'src/app/service/moto/moto.service';

@Component({
  selector: 'app-moto-home',
  templateUrl: './moto-home.component.html',
  styleUrls: ['./moto-home.component.css']
})
export class MotoHomeComponent implements OnInit {

  listaMotos!: Moto[];

  constructor(private motoService: MotoService) { }

  ngOnInit(): void {
    this.motoService.getAll().toPromise().then(list => {
      this.listaMotos = list;
    }).catch(error=>console.log(error));
  }

  setMoto(moto: Moto) {
    MotoService.moto = moto;
  }

}
