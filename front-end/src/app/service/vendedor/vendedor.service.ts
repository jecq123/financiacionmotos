import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Vendedor } from 'src/app/model/vendedor';
import { ServiceUtil } from 'src/app/util/service-util';
import { environment } from 'src/environments/environment';

const URL = environment.url + 'vendedor';

@Injectable({
  providedIn: 'root'
})
export class VendedorService {

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  obtenerPorIdentificacion(identificacion: string): Observable<Vendedor> {
    return this.http.get<Vendedor>(`${URL}/${identificacion}`, {headers: this.serviceUtil.getSimpleHeader()});
  }
}
