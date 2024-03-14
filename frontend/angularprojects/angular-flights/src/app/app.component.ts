import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  title = 'country';
  constructor(private router: Router) {}

  navigateToClientDetails(): void {
    this.router.navigate(['/client-details']);
  }
}
