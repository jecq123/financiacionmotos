import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { ProductCardComponent } from './component/product-card/product-card.component';
import { HomeComponent } from './component/home/home.component';
import { ProductHomeComponent } from './component/product-home/product-home.component';
import { ProductFormComponent } from './component/product-form/product-form.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ProductService } from './service/product/product.service';
import { IConfig, NgxMaskModule } from 'ngx-mask';
import { LoginComponent } from './component/login/login.component';
import { ProductoComponent } from './component/producto/producto.component';
import { CotizacionComponent } from './component/cotizacion/cotizacion.component';
import { MotoCardComponent } from './component/moto/moto-card/moto-card.component';
import { MotoHomeComponent } from './component/moto/moto-home/moto-home.component';
import { MotoFormComponent } from './component/moto/moto-form/moto-form.component';
const maskConfigFunction: () => Partial<IConfig> = () => {
  return {
    validation: false,
  };
};

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ProductCardComponent,
    HomeComponent,
    ProductHomeComponent,
    ProductFormComponent,
    LoginComponent,
    ProductoComponent,
    CotizacionComponent,
    MotoCardComponent,
    MotoHomeComponent,
    MotoFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    NgxMaskModule.forRoot(maskConfigFunction)
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
