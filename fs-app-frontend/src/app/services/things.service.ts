import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Thing } from '../../thing';
import { ThingsMock } from '../../thing-mock';
import { of } from 'rxjs/observable/of';

@Injectable({
  providedIn: 'root'
})
export class ThingsService {

  constructor(public http: HttpClient) { }

  getThings() {
    return this.http.get<Thing[]>('http://localhost:8080/things');
    // return of(ThingsMock);
  }

  getThing(id: number) {
    return this.http.get<Thing>('http://localhost:8080/things/' + id);
    // return of(ThingsMock[id - 1]);
  }
}
