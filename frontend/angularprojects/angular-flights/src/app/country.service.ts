import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Country } from "./country";

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private countryUrl: string;

  constructor(private http: HttpClient) {
    this.countryUrl = 'http://localhost:8080/create/createcountry';
  }

  

  public save(country: Country):Observable<Object> {
    return this.http.post(`${this.countryUrl}`, country,{responseType:'text'});
  }
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Country } from "./country";

@Injectable({
  providedIn: 'root'
})
export class CountryService {

  private countryUrl: string;

  constructor(private http: HttpClient) {
    this.countryUrl = 'http://localhost:8080/create/createcountry';
  }

  

  public save(country: Country):Observable<Object> {
    return this.http.post(`${this.countryUrl}`, country,{responseType:'text'});
  }
}

