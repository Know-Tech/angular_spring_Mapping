import { Component, OnInit, Input } from '@angular/core';

import {StaffService} from '../../shared_staff/staff.service';
import {Staff} from '../../staff';
import { StafflistComponent } from '../stafflist/stafflist.component';


@Component({
  selector: 'app-staffform',
  templateUrl: './staffform.component.html',
  styleUrls: ['./staffform.component.css']
})
export class StaffformComponent implements OnInit {

  @Input() staffs: Staff;
  constructor(private staffService: StaffService, private listComponent: StafflistComponent) { }
 

  ngOnInit() {  }

  updateActive(isActive: boolean) {
    this.staffService.updateStaff(this.staffs.id,
      { name: this.staffs.sname, skill: this.staffs.skill, active: isActive })
      .subscribe(
        data => {
          console.log(data);
          this.staffs = data as Staff;
        },
        error => console.log(error));
  }
 
  deleteCustomer() {
    this.staffService.deleteStaff(this.staffs.id)
      .subscribe(
        data => {
          console.log(data);
          this.listComponent.reloadData();
        },
        error => console.log(error));
  }

}
