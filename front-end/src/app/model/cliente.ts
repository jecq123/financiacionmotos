import { Persona } from "./persona";

export interface Cliente {
    idCliente: number;
    persona: Persona;
    correo: string;
    residencia: string;
}