import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { ProductHomeComponent } from './component/product-home/product-home.component';
import { LoginComponent } from './component/login/login.component';
import { ProductoComponent } from './component/producto/producto.component';
import { CotizacionComponent } from './component/cotizacion/cotizacion.component';
import { MotoHomeComponent } from './component/moto/moto-home/moto-home.component';

const routes: Routes = [
  {
    path: 'moto-home',
    component: MotoHomeComponent
  },
  {
    path: 'product-home',
    component: ProductHomeComponent
  },
  {
    path: 'producto',
    component: ProductoComponent
  },
  {
    path: 'cotizacion',
    component: CotizacionComponent
  },
  { path: 'login', component: LoginComponent},
  { path: '**' , pathMatch: 'full' , redirectTo: 'login'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
