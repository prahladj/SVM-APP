import { Component, OnInit } from '@angular/core';

import * as data from '../../../assets/json/about_us.json';

@Component({
  selector: 'app-about-us',
  templateUrl: './about-us.page.html',
  styleUrls: ['./about-us.page.scss'],
})
export class AboutUsPage implements OnInit {
  matha: any = (data as any).default;

  constructor() { }

  ngOnInit() {
  }

}
