import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { CreateCountryComponent } from './create-country/create-country.component'; // Ensure correct path

@NgModule({
  declarations: [
    AppComponent,
    CreateCountryComponent  // Ensure it is declared here
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
