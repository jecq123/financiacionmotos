import Swal from "sweetalert2";

export class Excepcion {
    static controlar(error: Error, mensaje?: string): void {
        console.log(Error);
        Swal.fire('Ups, algo salio mal por favor vuelve a intentar');
    }
}