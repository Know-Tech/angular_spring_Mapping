import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {StaffService} from './shared_staff/staff.service';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StafflistComponent } from './components/stafflist/stafflist.component';
import { StaffformComponent } from './components/staffform/staffform.component';
import { CreateStaffComponent } from './components/create-staff/create-staff.component';

const appRoutes:Routes=[
  {path:'',component:StafflistComponent},
  {path:'op',component:StaffformComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    StafflistComponent,
    StaffformComponent,
    CreateStaffComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [StaffService],
  bootstrap: [AppComponent]
})
export class AppModule { }
