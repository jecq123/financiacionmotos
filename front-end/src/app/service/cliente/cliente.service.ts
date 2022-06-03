import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from 'src/app/model/cliente';
import { ServiceUtil } from 'src/app/util/service-util';
import { environment } from 'src/environments/environment';

const URL = environment.url + 'cliente';

@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  obtenerPorIdentificacion(identificacion: string): Observable<Cliente> {
    return this.http.get<Cliente>(`${URL}/${identificacion}`, {headers: this.serviceUtil.getSimpleHeader()});
  }
}
