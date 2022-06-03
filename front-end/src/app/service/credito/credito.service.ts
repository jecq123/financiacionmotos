import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ComandoCredito } from 'src/app/comando/comando-credito';
import { Credito } from 'src/app/model/credito';
import { ServiceUtil } from 'src/app/util/service-util';
import { environment } from 'src/environments/environment';

const URL = environment.url + 'credito';

@Injectable({
  providedIn: 'root'
})
export class CreditoService {

  constructor(private http: HttpClient, private serviceUtil: ServiceUtil) { }

  calcularValorCuota(credito: Credito): Observable<number> {
    return this.http.post<number>(`${URL}/cuota`, this.buildComandoCredito(credito), { headers: this.serviceUtil.getJsonHeader() });
  }

  crear(credito: Credito): Observable<{valor: number}> {
    return this.http.post<{valor: number}>(`${URL}`, this.buildComandoCredito(credito), { headers: this.serviceUtil.getJsonHeader() });
  }

  buildComandoCredito(credito: Credito): ComandoCredito {
    return {
      idCredito: credito.idCredito,
      idCliente: credito.cliente?.idCliente,
      idVendedor: credito.vendedor?.idVendedor,
      idMoto: credito.moto?.idMoto,
      valorMoto: credito.valorMoto,
      valorCuotaInicial: credito.valorCuotaInicial,
      numeroCuotas: credito.numeroCuotas,
      valorCuota: credito.valorCuota,
      fecha: credito.fecha
    };
  }
}
