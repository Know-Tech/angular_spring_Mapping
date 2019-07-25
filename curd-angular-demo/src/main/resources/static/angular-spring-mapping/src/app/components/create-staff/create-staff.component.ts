import { Component, OnInit } from '@angular/core';

import {StaffService} from '../../shared_staff/staff.service';
import {Staff} from '../../staff';


@Component({
  selector: 'app-create-staff',
  templateUrl: './create-staff.component.html',
  styleUrls: ['./create-staff.component.css']
})
export class CreateStaffComponent implements OnInit {

  staffs: Staff = new Staff();
  submitted = false;

  constructor(private staffService: StaffService) { }

  ngOnInit() {  }

  newStaff(): void {
    this.submitted = false;
    this.staffs = new Staff();
  }
 
  save() {
    this.staffService.createStaff(this.staffs)
      .subscribe(data => console.log(data), error => console.log(error));
    this.staffs = new Staff();
  }
 
  onSubmit() {
    this.submitted = true;
    this.save();
  }

}
