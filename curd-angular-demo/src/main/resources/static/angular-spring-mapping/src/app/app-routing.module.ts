import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
  
import { StafflistComponent } from './stafflist/stafflist.component';
import { CreateStaffComponent } from './create-staff/create-staff.component';

const routes: Routes =  [
    { path: '', redirectTo: 'staff', pathMatch: 'full' },
    { path: 'staff', component: StafflistComponent },
    { path: 'create', component: CreateStaffComponent }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})  
export class AppRoutingModule { }
