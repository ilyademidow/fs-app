import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ThingsComponent } from '../things/things.component';
import { ThingComponent } from '../thing/thing.component';

const appRoutes: Routes = [
  {path: 'things', component: ThingsComponent},
  {path: 'things/:id', component: ThingComponent},
  ];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
