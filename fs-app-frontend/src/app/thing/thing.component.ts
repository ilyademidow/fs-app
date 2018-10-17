import { Component, OnInit } from '@angular/core';
import { ThingsService } from '../services/things.service';
import { Router } from '@angular/router';
import { Thing } from '../../thing';

@Component({
  selector: 'app-thing',
  templateUrl: './thing.component.html',
  styleUrls: ['./thing.component.css']
})
export class ThingComponent implements OnInit {
  thing: Thing = {
    id: 0,
    name: '',
    description: ''
  };

  constructor(private thingService: ThingsService, private router: Router) { }

  ngOnInit() {
    const urlParam = this.router.url.split('/');
    this.thingService.getThing(Number.parseFloat(urlParam[urlParam.length - 1])).subscribe((returnedThing) => {
      this.thing = returnedThing;
    });
  }

}
