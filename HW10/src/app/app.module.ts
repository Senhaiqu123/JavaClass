import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChildComponent } from './child/child.component';
import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import { HighlightDirective } from './my-highlight.directive';

@NgModule({
  declarations: [
    AppComponent,
    ChildComponent,
    HighlightDirective
  ],
    imports: [
        BrowserModule,
      HttpClientModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
