import {Component, Input, OnInit} from '@angular/core';
import {DataService} from "../data.service";

@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {


  Cards : object;

  constructor(private data: DataService) { }

  ngOnInit() {
    this.data.getThumbnail().subscribe(data => {
        console.log(data);
        this.Cards=data;
      }
    );
  }

  
}
