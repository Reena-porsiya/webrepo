import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Country } from './create-country/country.model';


@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private apiUrl = 'http://localhost:8081/country/create';

  constructor(private http: HttpClient) { }

  createCountry(country: Country): Observable<any> {
    return this.http.post(this.apiUrl, country);
  }
}
