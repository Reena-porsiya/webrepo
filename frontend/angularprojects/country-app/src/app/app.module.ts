// app.module.ts
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { CreateCountryComponent } from './create-country/create-country.component'; // Import CreateCountryComponent

@NgModule({
  declarations: [
    AppComponent,
    CreateCountryComponent // Add CreateCountryComponent to declarations array
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
