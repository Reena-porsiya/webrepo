import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Flight } from '../../models/flight.model';
import { FlightService } from '../../services/flight.service';

@Component({
  selector: 'app-flight-details',
  templateUrl: './flight-details.component.html',
  styleUrls: ['./flight-details.component.css'],
})
export class FlightDetailsComponent implements OnInit {
  @Input() viewMode = false;

  @Input() currentFlight: Flight = {
    iataCountryCode: '',
    name: ''
  };

  message = '';

  constructor(
    private flightService: FlightService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    if (!this.viewMode) {
      this.message = '';
      this.getFlight(this.route.snapshot.params['iataCountryCode']);
    }
  }

  getFlight(iataCountryCode: string): void {
    this.flightService.get(iataCountryCode).subscribe({
      next: (data) => {
        this.currentFlight = data;
        console.log(data);
      },
      error: (e) => console.error(e)
    });
  }

  updateFlight(): void {
    this.message = '';

    // Check if iataCountryCode is defined
    if (this.currentFlight.iataCountryCode) {
        this.flightService
            .update(this.currentFlight.iataCountryCode, this.currentFlight)
            .subscribe({
                next: (res) => {
                    console.log(res);
                    this.message = res.message
                        ? res.message
                        : 'This country was updated successfully!';
                },
                error: (e) => console.error(e)
            });
    } else {
        console.error('iataCountryCode is undefined');
    }
}


  deleteFlight(): void {
    this.flightService.delete(this.currentFlight.iataCountryCode).subscribe({
      next: (res) => {
        console.log(res);
        this.router.navigate(['/get']);
      },
      error: (e) => console.error(e)
    });
  }
}
