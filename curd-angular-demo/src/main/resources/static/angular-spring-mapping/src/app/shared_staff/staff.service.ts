import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import {Staff} from '../staff';
@Injectable({
  providedIn: 'root'
})
export class StaffService {

  private baseUrl:string=this.newMethod();
  constructor(private http: HttpClient) { }

  private newMethod(): string {
    return "http://localhost:8080/api/staffs";
  }

  getStaff(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }
 
  createStaff(staff: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}` + `/create`, staff);
  }
 
  updateStaff(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }
 
  deleteStaff(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }
 
  getStaffsList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
 
  /*getCustomersById(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/id/${id}`);
  }
  */
 
  deleteAll(): Observable<any> {
    return this.http.delete(`${this.baseUrl}` + `/delete`, { responseType: 'text' });
  }
}
