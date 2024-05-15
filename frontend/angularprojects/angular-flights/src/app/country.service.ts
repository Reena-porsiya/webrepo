// src/app/country.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CountryService {
  private baseUrl = 'http://localhost:8081/country/create';

  constructor(private http: HttpClient) { }

  createCountry(countryData: any): Observable<any> {
    return this.http.post<any>(this.baseUrl, countryData);
  }
}
