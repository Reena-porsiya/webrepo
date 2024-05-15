import { Component } from '@angular/core';
import { ClientService } from '../client.service';

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.css']
})
export class ClientDetailsComponent {
  clientId: string;
  clientData: any;

  constructor(private clientService: ClientService) { }

  getClientDetails(clientId: string): void {
    this.clientService.getClientDetails(clientId).subscribe(
      (data: any) => {
        this.clientData = data;
      },
      (error: any) => {
        console.log('Error fetching client details:', error);
      }
    );
  }
}
