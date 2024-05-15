import { Component, OnInit } from '@angular/core';
import { Flight } from '../../models/flight.model';
import { FlightService } from '../../services/flight.service';

@Component({
  selector: 'app-flight-list',
  templateUrl: './flight-list.component.html',
  styleUrls: ['./flight-list.component.css']
})
export class FlightListComponent implements OnInit {


  flights?: Flight[];
  currentFlight: Flight = {
    
  };
  currentIndex = -1;
  

    
  constructor(private flightService: FlightService) {}

  ngOnInit(): void {
    this.retrieveFlight();
  }

  retrieveFlight(): void {
    this.flightService.getAll().subscribe({
      next: (data) => {
        this.flights = data;
        console.log(data);
      },
      error: (e) => console.error(e)
    });
  }
  
 setActiveFlight(flight: Flight, index: number): void {
    this.currentFlight= flight;
    this.currentIndex = index;
   
  }

}
