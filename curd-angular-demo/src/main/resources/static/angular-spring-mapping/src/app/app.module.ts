import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {RouterModule, Routes} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';

import {StaffService} from './shared_staff/staff.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StafflistComponent } from './stafflist/stafflist.component';
import { StaffformComponent } from './staffform/staffform.component';
import { CreateStaffComponent } from './create-staff/create-staff.component';

/*const appRoutes:Routes=[
  {path:'',component:StafflistComponent},
  {path:'op',component:StaffformComponent}
];
*/
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
    FormsModule,
   /* RouterModule.forRoot(appRoutes)*/
  ],
  /*providers: [StaffService],*/
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
