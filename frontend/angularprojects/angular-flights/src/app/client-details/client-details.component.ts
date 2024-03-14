import { Component } from '@angular/core';

@Component({
  selector: 'app-client',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.css']
})
export class ClientDetailsComponent {
  clientData = {
    client_id: '',
    first_name: '',
    middle_name: '',
    last_name: '',
    phone: '',
    email: '',
    passport: ''
  };
ClientDetailsComponent: any;

  submitForm(): void {
    // Here, you can implement the logic to send the clientData to your backend server
    // For example, you can use Angular's HttpClient to make an HTTP request

    // Replace the following console.log with your actual HTTP request
    console.log('Form submitted!', this.clientData);
  }
}
