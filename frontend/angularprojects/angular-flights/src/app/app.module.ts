import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreateCountryComponent } from './create-country/create-country.component';
import { FormsModule }   from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { CreateUserComponent } from './create-user/create-user.component';
import { UserComponent } from './user/user.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateCountryComponent,
    CreateUserComponent,
    UserComponent,
   
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
