import { Component, OnInit } from '@angular/core';
import {DataService} from "../data.service";
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  incoming : Object;
  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getThumbnail().subscribe(data => {
        console.log(data);
        this.incoming = data;
      }
    );
  }

}
