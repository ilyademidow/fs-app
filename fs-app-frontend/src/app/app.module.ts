import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ThingsService } from './services/things.service';
import { ThingComponent } from './thing/thing.component';
import { ThingsComponent } from './things/things.component';
import { Router } from '@angular/router';
import { AppRoutingModule } from './app-routing/app-routing.module';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ThingComponent,
    ThingsComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [ThingsService],
  bootstrap: [AppComponent]
})
export class AppModule {
  constructor(private router: Router) {};
}
