const options = {
  chart: {
    type: 'networkgraph',
    style: {
      margin: 0
    }
  },
  title: {
    style: {
      display: 'none'
    }
  },
  plotOptions: {
    networkgraph: {
      keys: ['from', 'to'],
      layoutAlgorithm: {
        enableSimulation: true,
        integration: 'verlet',
        linkLength: 200
      }
    }
  },
  series: [
    {
      color: '#05454d',
      link: {
        width: 2,
        color: '#05454d',
      },
      marker: {
        radius: 52,
        fillColor: '#068285',
        lineWidth: 2,
        lineColor: '#05454d'
      },
      dataLabels: {
        style: {
          fontFamily: "Seravek",
          color: "white",
          width: 55,
        },
        rotation: 0,
        useHTML: true,
        linkTextPath: {
          enabled: false
        },
        linkFormat: '',
        enabled: true,
      },
      data: termLinks,
      type: "networkgraph"
    }
  ],
  credits: {
    enabled: false
  }
};

const initializeMindMap = () => Highcharts.chart('mind-map', options);
const initializeGlossary = () => {
  Object.keys(terms).forEach(term => {
    const glossaryContainer = document.getElementById("glossary");
    let div = document.createElement("div");
    div.classList.add("term", "fade-in");
    div.innerHTML = `<div class="title">${term}</div><div>${terms[term]}</div>`;
    glossaryContainer.appendChild(div)
  });
}

window.addEventListener('load', () => {
  initializeMindMap();
  initializeGlossary();
});

