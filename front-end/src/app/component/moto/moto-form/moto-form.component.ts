import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Moto } from 'src/app/model/moto';
import { MotoService } from 'src/app/service/moto/moto.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-moto-form',
  templateUrl: './moto-form.component.html',
  styleUrls: ['./moto-form.component.css']
})
export class MotoFormComponent implements OnInit {

  listaMotos!: Moto[];
  moto!: Moto;
  motoEdicion!: Moto;
  form!: FormGroup;
  constructor(private motoService: MotoService, private formBuilder: FormBuilder, private router: Router) { }

  ngOnInit(): void {
    this.getListaMotos();
    this.buildForm();
  }
  
  getListaMotos() {
    this.motoService.getAll().toPromise().then(list => {
      this.listaMotos = list;
    }).catch(error => console.log(error));
  }

  onCrear() {
    this.guardar();
  }
  
  buildForm(): void {
    this.form = this.formBuilder.group({
      idProducto: undefined,
      referencia: [undefined, Validators.required],
      marca: [undefined, Validators.required],
      modelo: [undefined, Validators.required],
      cilindraje: [undefined, Validators.required],
      precio: [undefined, Validators.required]
    });
  }

  delete(moto: Moto): void {
    this.motoService.delete(moto).toPromise().then(idMoto => {
      console.log(idMoto);
      Swal.fire('Producto ha sido eliminado del inventario correctamente');
    }).catch(error => {
      console.log(error);
      Swal.fire('Ha ocurrido un problema por lo que no se pudo eliminar el producto del inventario');
    });
  }

  guardar() {
    /* this.motoService.create(productToCreate).toPromise().then(idProducto => {
      console.log('id', idProducto);
      productToCreate.idProducto = idProducto.valor;
      this.productService.addProduct(productToCreate);
      Swal.fire('Producto adicionado correctamente');
    }).catch(error => {
      console.log(error);
      Swal.fire('Ha ocurrido un problema, por lo que no se pudo adicionar el producto');
    }); */
  }

  update(): void {
    /* const productoToUpdate = this.productService.buildProduct(this.form.value, this.productoEdicion);
    this.productService.update(productoToUpdate).toPromise().then(idProducto => {
      console.log('id', idProducto);
      this.inventarioService.changeProductInInventarioList(productoToUpdate)
      this.productService.changeProduct(this.productoEdicion, productoToUpdate);
      Swal.fire('Producto ha sido cambiado correctamente');
    }).catch(error => {
      console.log(error);
      Swal.fire('Ha ocurrido un problema, por lo que no se pudo editar el producto');
    }); */
  }

  onEditar() {
    this.update();
  }

}
