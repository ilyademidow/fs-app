import { Component, OnInit } from '@angular/core';
import { ThingsService } from '../services/things.service';
import { Router } from '@angular/router';
import { Thing } from '../../thing';

@Component({
  selector: 'app-things',
  templateUrl: './things.component.html',
  styleUrls: ['./things.component.css']
})
export class ThingsComponent implements OnInit {
  things: Thing[];
  newThing: Thing;

  constructor(private thingsService: ThingsService, private router: Router) {
  }

  ngOnInit() {
    this.thingsService.getThings().subscribe((returnedThings) => {
      this.things = returnedThings;
    });
  }

  saveThing(name: string, desc: string) {
    const newThing = { id: null, name: name, description: desc };
    this.thingsService.saveThing(newThing).subscribe((returnedThings) => {
      this.things = returnedThings;
    });
    name = '';
    desc = '';
  }

}
