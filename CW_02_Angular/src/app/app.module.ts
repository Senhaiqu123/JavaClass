import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {routing} from "./routing";

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewDirectiveComponent } from './new-directive/new-directive.component';
import { NewDirective3Component } from './new-directive3/new-directive3.component';

import { FahrenheitPipe } from './fahrenheit.pipe';
import { PhoneNumberPipe } from './phone-number.pipe';
import { PageAComponent } from './page-a/page-a.component';
import { PageBComponent } from './page-b/page-b.component';
import { DefaultComponent } from './default/default.component';

@NgModule({
  declarations: [
    AppComponent,
    NewDirectiveComponent,
    NewDirective3Component,


    FahrenheitPipe,
     PhoneNumberPipe,
     PageAComponent,
     PageBComponent,
     DefaultComponent,
  ],
  imports: [
    BrowserModule,
    routing,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
