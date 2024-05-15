import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Flight } from '../models/flight.model';


 const baseUrl = 'http://localhost:8080/country';
 const getUrl = 'http://localhost:8080/country/get';
 const updateUrl = "http://localhost:8080/country/update";
 const deleteUrl = "http://localhost:8080/country/delete";

 

@Injectable({
  providedIn: 'root'
})
export class FlightService {
  
  iata_country_code: any = '';
  constructor(private http: HttpClient) { }


  create(data: any): Observable<any> {
    return this.http.post(baseUrl, data);
  }

  getAll(): Observable<Flight[]> {
    return this.http.get<Flight[]>(getUrl);
}

update(iataCountryCode: string, data: any): Observable<any> {
  return this.http.put(`${baseUrl}/update/${iataCountryCode}`, data);
}
get(iataCountryCode: any): Observable<Flight> {
  return this.http.get<Flight>(`${baseUrl}/get/${iataCountryCode}`);
}

delete(iataCountryCode: any): Observable<any> {
  
  return this.http.delete(`${baseUrl}/delete/${iataCountryCode}`);
}
deleteAll(): Observable<Flight> {
  return this.http.delete(deleteUrl);
}
}
