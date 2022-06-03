import { Persona } from "./persona";

export interface Cliente {
    idCliente: number;
    identificacion: string;
    nombreCompleto: string;
    contacto: string;
    correo: string;
    residencia: string;
}