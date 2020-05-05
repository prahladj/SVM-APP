import { Component, OnInit } from '@angular/core';

import * as data from '../../../assets/json/vyasarajaru.json';

@Component({
  selector: 'app-about-vyasarajaru',
  templateUrl: './about-vyasarajaru.page.html',
  styleUrls: ['./about-vyasarajaru.page.scss'],
})
export class AboutVyasarajaruPage implements OnInit {
  vyasarajaru: any = (data as any).default;

  constructor() {  }
  
  ngOnInit() {}

}
