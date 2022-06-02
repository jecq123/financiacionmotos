import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import { Moto } from 'src/app/model/moto';
import { ServiceUtil } from 'src/app/util/service-util';
import { environment } from 'src/environments/environment';

const URL = environment.url + 'moto';
@Injectable({
  providedIn: 'root'
})
export class MotoService {
  private motos: Moto[] = [];

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  getAll(): Observable<Moto[]> {
    return this.http.get<Moto[]>(URL, {headers: this.serviceUtil.getSimpleHeader()});
  }
}
