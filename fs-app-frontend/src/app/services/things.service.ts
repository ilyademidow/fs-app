import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Thing } from '../../thing';
import { environment } from '../../environments/environment';
import { ThingsMock } from '../../thing-mock';
import { of } from 'rxjs/observable/of';
import { log } from 'util';

@Injectable({
  providedIn: 'root'
})
export class ThingsService {

  constructor(public http: HttpClient) { }

  getThings() {
    log('Get things ' + environment.thingServiceUrl + 'api/things');
    return this.http.get<Thing[]>(environment.thingServiceUrl + 'api/things');
    // return of(ThingsMock);
  }

  getThing(id: number) {
    return this.http.get<Thing>(environment.thingServiceUrl + 'api/things/' + id);
    // return of(ThingsMock[id - 1]);
  }

  saveThing(thing: Thing) {
    return this.http.post<Thing[]>(environment.thingServiceUrl + 'api/things', thing);
    // return of(ThingsMock[id - 1]);
  }
}


