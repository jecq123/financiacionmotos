import { Persona } from "./persona";

export interface Vendedor {
    idVendedor: number;
    identificacion: string;
    nombreCompleto: string;
    contacto: string;
    correo: string;
    residencia: string;
}