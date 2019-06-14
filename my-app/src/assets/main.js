'use strict';


$(window).scroll(function() {

    if ($(this).scrollTop()  >= 100){  
        $('.card-department-tabs').addClass("tabs-after-scroll");
    }
    else{
        $('.card-department-tabs').removeClass("tabs-after-scroll");
    }
});





$(document).ready(function () {
	$('#tableOne tbody tr').each(function (index) {
		var row = $(this)
		var i = 0;
		$('#tableOne thead tr:first-child th').each(function (subindex) {

			if (row.find('td').eq(i).attr('colspan') === undefined) {
				if ($(this).attr('colspan') === undefined) {
					row.find('td').eq(i).addClass($(this).attr('class'));
					i++;
				} else {
					for (var j = 0; j < $(this).attr('colspan'); j++) {
						row.find('td').eq(i).addClass($(this).attr('class'));
						i++;
					}
				}
			} else {

				i = subindex

			}

		});
	});

	$("#openCloseFilter, .openCloseFilterBtn, #openCloseFilter01").click(function () {
		$("#filterCollapseContainer").toggleClass("openFilter");
	});

	$('#select_box').change(function () {
		$('#changing_image').attr('src', $('#select_box').val());
	});

	$('#districtsMulti').multiselect({
		buttonWidth: '100%',
		templates: {
			li: '<li><a href="javascript:void(0);"><label></label></a></li>'
		},
		nonSelectedText: 'Select Districts'
	});
	$('#mandalsMulti').multiselect({
		buttonWidth: '100%',
		templates: {
			li: '<li><a href="javascript:void(0);"><label></label></a></li>'
		},
		nonSelectedText: 'Select Mandals'
	});
	$('#schoolMulti').multiselect({
		buttonWidth: '100%',
		templates: {
			li: '<li><a href="javascript:void(0);"><label></label></a></li>'
		},
		nonSelectedText: 'Select Schools'
	});

	$('[data-toggle="tooltip"]').tooltip()


	var statisticCarousel = $('.statistic-carousel');
	var habitationCarousel = $('.habitation-carousel');
	if (statisticCarousel.length) {
		$('.statistic-carousel').owlCarousel({
			loop: true,
			margin: 10,
			responsiveClass: true,
			autoplay: true,
			autoplayTimeout: '5000',
			autoplayHoverPause: true,
			responsive: {
				0: {
					items: 1,
					nav: false
				},
				600: {
					items: 3,
					nav: false
				},
				1000: {
					items: 5,
					nav: false,
					loop: false
				}
			}
		})
	}
	if (habitationCarousel.length) {
		$('.habitation-carousel').owlCarousel({
			loop: true,
			margin: 10,
			responsiveClass: true,
			autoplay: true,
			autoplayTimeout: '5000',
			autoplayHoverPause: true,
			responsive: {
				0: {
					items: 1,
					nav: false
				},
				600: {
					items: 2,
					nav: false
				},
				1000: {
					items: 3,
					nav: false,
					loop: false
				}
			}
		})
	}


	var options = [];

	$('.multiselect.dropdown-menu a').on('click', function (event) {

		var $target = $(event.currentTarget),
			val = $target.attr('data-value'),
			$inp = $target.find('input'),
			idx;

		if ((idx = options.indexOf(val)) > -1) {
			options.splice(idx, 1);
			setTimeout(function () {
				$inp.prop('checked', false)
			}, 0);
		} else {
			options.push(val);
			setTimeout(function () {
				$inp.prop('checked', true)
			}, 0);
		}

		$(event.target).blur();

		console.log(options);
		return false;
	});
});