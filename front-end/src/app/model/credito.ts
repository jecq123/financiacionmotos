import { Cliente } from "./cliente";
import { Moto } from "./moto";
import { Vendedor } from "./vendedor";

export interface Credito {
    idCredito: number;
    cliente: Cliente;
    vendedor: Vendedor;
    moto: Moto;
    valorMoto: number;
    valorCuotaInicial: number;
    numeroCuotas: number;
    valorCuota: number;
    fecha: Date;
}