import { Component, Input } from '@angular/core';
import { NavParams } from '@ionic/angular';

@Component({
    selector: 'filterModalPage-page',
    templateUrl: './filterModalPage.html',
    styleUrls: ['./filterModalPage.scss'],
})

export class FilterModalPage {
    modalCtrl: any;
    constructor() { }

    dismissModal() {
        this.modalCtrl.dismiss({
            'dismissed': true
        });
    }
}