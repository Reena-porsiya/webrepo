import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddFlightComponent } from './component/add-flight/add-flight.component';
import { FlightListComponent } from './component/flight-list/flight-list.component';
import { FlightDetailsComponent } from './component/flight-details/flight-details.component';

const routes: Routes = [
  { path: 'add', component: AddFlightComponent },
  { path: 'get', component:  FlightListComponent},
  { path: 'flight/:iataCountryCode', component: FlightDetailsComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
