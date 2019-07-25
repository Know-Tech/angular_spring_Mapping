import { Component, OnInit } from '@angular/core';

import { Observable } from 'rxjs';
import {StaffService} from '../../shared_staff/staff.service';
import {Staff} from '../../staff';

@Component({
  selector: 'app-stafflist',
  templateUrl: './stafflist.component.html',
  styleUrls: ['./stafflist.component.css']
})
export class StafflistComponent implements OnInit {

  staffs: Observable<Staff[]>;

  constructor(private staffService: StaffService) { }

  ngOnInit() {
    this.reloadData();
  }

  deleteStaffs() {
    this.staffService.deleteAll()
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log('ERROR: ' + error));
  }
 
  reloadData() {
    this.staffs = this.staffService.getStaffsList();
  }

}
