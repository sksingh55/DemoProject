import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';  // Import it up here
@Injectable({
  providedIn: 'root'
})
export class DataService {


	constructor(private http: HttpClient) { }



	getUsers() {
	  return this.http.get('http://localhost:8080/topicid');

  	}

  getThumbnail() {
    return this.http.get('http://localhost:8080/topics');

  }

}
