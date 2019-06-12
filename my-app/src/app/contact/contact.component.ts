import { Component, OnInit } from '@angular/core';
import {DataService} from "../data.service";

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  response : Object;

  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getThumbnail().subscribe(data => {
        console.log(data);
        this.response = data;
        console.log(this.response['thubmnailList']['0']['nameOfThumbnail']);
      }
    );
  }

  
}
