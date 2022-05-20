import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Moto } from 'src/app/model/moto';

@Injectable({
  providedIn: 'root'
})
export class MotoService {
  private motos: Moto[] = [];

  constructor() { }

  getAll(): Observable<Moto[]> {
    for (let index = 0; index < 10; index++) {
      const moto: Moto = {
        idMoto: index,
        referencia: 'referencia ' + index,
        marca: 'marca ' + index,
        modelo: 2013 + index,
        cilindraje: 100 + 50*index,
        precio: 5000000 + 1000000*index
      };
      this.motos.push(moto);
    }
    return of(this.motos);
  }
}
