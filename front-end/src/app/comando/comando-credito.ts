export interface ComandoCredito {
    idCredito: number;
    idCliente: number;
    idVendedor: number;
    idMoto: number;
    valorMoto: number;
    valorCuotaInicial: number;
    numeroCuotas: number;
    valorCuota: number;
    fecha: Date;
}