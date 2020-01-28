import { Component, OnInit } from '@angular/core';
import { ModalController } from '@ionic/angular';

// import { FilterModalPage } from '../modals/filterModalPage.page';
import {FilterModalPage} from '../modals/filterModalPage';

@Component({
  selector: 'app-upanyasa',
  templateUrl: './upanyasa.page.html',
  styleUrls: ['./upanyasa.page.scss'],
})
export class UpanyasaPage implements OnInit {

  constructor(public modalController: ModalController) { }

  ngOnInit() {
  }

  async filterModal() {
    const modal = await this.modalController.create({
      component: FilterModalPage
    });
    return await modal.present();
  }

}
